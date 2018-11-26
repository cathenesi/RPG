package br.cathenesi.rpg.application;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import br.cathenesi.rpg.domain.model.gamemap.GameMap;

public class MapFactory {

	class MapElement {

		private String key;
		private String value;

		public MapElement(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
	}

	public List<GameMap> createMaps() throws Exception {

		List<MapElement> mapElements = new ArrayList<>();
		List<GameMap> maps = new ArrayList<>();

		URI uri = this.getClass().getResource("/maps").toURI();
		Path myPath;
		if (uri.getScheme().equals("jar")) {
			FileSystem fileSystem = FileSystems.newFileSystem(uri, Collections.<String, Object>emptyMap());
			myPath = fileSystem.getPath("/maps");
		} else {
			myPath = Paths.get(uri);
		}

		try (Stream<Path> walk = Files.walk(myPath, 1)) {
			
			for (Iterator<Path> it = walk.iterator(); it.hasNext();) {
				Path path = it.next();
				if (path.toString().endsWith(".yml")) {

					Files.lines(path).forEach(s -> {
						StringTokenizer st = new StringTokenizer(s, ":");
						if (st.countTokens() == 2) {
							mapElements.add(new MapElement(st.nextToken().trim(), st.nextToken().trim()));
						}
					});

					maps.add(new MapBuilder(mapElements).build());
					mapElements.clear();
				}
			}
		}

		return maps;
	}

}

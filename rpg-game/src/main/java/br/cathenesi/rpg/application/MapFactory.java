package br.cathenesi.rpg.application;

import java.io.File;
import java.io.FileFilter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import br.cathenesi.rpg.domain.model.map.GameMap;

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

	public List<GameMap> build() throws Exception {

		List<GameMap> maps = new ArrayList<>();

		File root = new File(ClassLoader.getSystemResource("maps").getFile());
		File[] files = root.listFiles(new FileFilter() {

			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".yml");
			}
		});

		List<MapElement> mapElements = new ArrayList<>();

		for (File file : files) {

			System.out.println(">> Creating map " + file.getName());

			Files.lines(Paths.get(file.getAbsolutePath()), StandardCharsets.UTF_8).forEach(s -> {
				StringTokenizer st = new StringTokenizer(s, ":");
				if (st.countTokens() == 2) {
					mapElements.add(new MapElement(st.nextToken().trim(), st.nextToken().trim()));
				}
			});

			maps.add(new MapBuilder(mapElements).build());
			mapElements.clear();
		}

		return maps;
	}
	
}

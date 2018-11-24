package br.cathenesi.rpg.application;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

import br.cathenesi.rpg.domain.model.map.Map;

public class MapBuilder {

	public List<Map> build() throws Exception {

		try {
			File root = new File(MapBuilder.class.getResource("/maps").toURI());
			File[] files = root.listFiles(new FileFilter() {

				public boolean accept(File pathname) {
					return pathname.getName().endsWith(".yml");
				}
			});

			for (File file : files) {
				System.out.println(file.getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;

	}
}

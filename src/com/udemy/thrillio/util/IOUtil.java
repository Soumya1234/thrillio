package com.udemy.thrillio.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class IOUtil {
	public static void read(String[] data, String fileName) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
			String text = null;
			int count = 0;
			while((text = reader.readLine())!=null) {
				data[count] = text;
				count++;
			}

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

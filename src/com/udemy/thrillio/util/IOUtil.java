package com.udemy.thrillio.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class IOUtil {
	public static void read(String[] data, String fileName) {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
			String text = null;
			int count = 0;
			while ((text = reader.readLine()) != null) {
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

	public static String read(InputStream in) {
		// TODO Auto-generated method stub
		StringBuilder text = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				text.append(line).append("\r\n");
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
		return text.toString();
	}

	public static void write(String webpage, long id) {
		// TODO Auto-generated method stub

		try (BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("E:/eclipse projects/thrillio/pages/" + id + ".html"), "UTF-8"))) {
			out.write(webpage);

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

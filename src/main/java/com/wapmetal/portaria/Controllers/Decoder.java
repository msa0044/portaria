package com.wapmetal.portaria.Controllers;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Decoder {
	public static String convert(String txt) {
		try {
			return URLDecoder.decode(txt, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}

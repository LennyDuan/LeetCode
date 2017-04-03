package questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenny on 03/04/2017.
 */
public class EncodeAndDecodeTinyURL535 {
    // Encodes a URL to a shortened URL.
    List<String> urls = new ArrayList<>();

    public String encode(String longUrl) {
        urls.add(longUrl);
        String encode = String.valueOf(urls.size() - 1);
        return encode;
    };

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);

        return (index<urls.size()) ? urls.get(index) : "";
    };
}

package com.freedom.util;

import org.apache.commons.codec.binary.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Created by kuiyuxiang on 2017/4/14.
 */
public class HttpUtils {
    /**
     * 生成彩印接口所需要的请求头参数
     * @param appSign
     * @param appKey
     * @return
     */
    public static Map<String,String> getHeaders(String appSign,String appKey){
        Map<String,String> headers = new HashMap<String,String>();

        headers.put("Authorization","WSSE realm=\"SDP\",profile=\"UsernameToken\",type=\"AppKey\"");

        Random random = new Random();
        String str = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char[] strArray = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        int l = strArray.length;
        int a;
        for ( int i = 0;i < 25; i++ ) {
            a = random.nextInt(l);
            sb.append(strArray[a]);
        }

        String nonce = sb.toString();

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        String created = sdf.format(calendar.getTime());

        String passwordDigest = "";
        try {
            MessageDigest msgDegest = MessageDigest.getInstance("SHA-256");
            String source = nonce + created + appKey;
            msgDegest.update(source.getBytes());
            passwordDigest = Base64.encodeBase64String(msgDegest.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        headers.put("X-WSSE","UsernameToken Username=\""+appSign
                +"\",PasswordDigest=\""+passwordDigest+"\",Nonce=\""+nonce+"\",Created=\""+created+"\"");
        headers.put("Content-Type","application/json;charset=UTF-8");
//		headers.put("Host", PrintConstant.FORMAL_HOST);
        return headers;
    }
}

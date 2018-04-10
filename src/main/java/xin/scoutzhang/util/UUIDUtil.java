package xin.scoutzhang.util;

import java.util.UUID;

/**
 * Created by DEAN on 2018/4/10.
 */
public class UUIDUtil {
    public static String get20UUID(){
        UUID id = UUID.randomUUID();
        String[] idd = id.toString().split("-");
        return idd[0]+idd[1]+idd[2]+idd[3];
    }
}

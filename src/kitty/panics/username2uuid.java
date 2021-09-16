package kitty.panics;

import java.util.UUID;

import static java.nio.charset.StandardCharsets.UTF_8;

public class username2uuid {

    public static void main(String[] args) {
        // 获取参数
        var JSON_TYPE = args[0];
        var USER_NAME = args[1];

        // 生成 UUID
        UUID GEN_UUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + USER_NAME).getBytes(UTF_8));

        // ops.json
        var OPS_JSON = String.format("""
                [
                  {
                    "uuid": %s,
                    "name": %s,
                    "level": 4,
                    "bypassesPlayerLimit": true
                  }
                ]
                """, GEN_UUID, USER_NAME);
        // whitelist.json
        var WLIST_JSON = String.format("""
                [
                  {
                    "uuid": %s,
                    "name": %s
                  }
                ]
                """, GEN_UUID, USER_NAME);

        // 判断 JSON_TYPE
        switch (JSON_TYPE) {
            case "-ops" -> System.out.print(OPS_JSON);
            case "-wlist" -> System.out.print(WLIST_JSON);
            default -> throw new IllegalStateException("Unexpected value: " + JSON_TYPE);
        }
    }
}
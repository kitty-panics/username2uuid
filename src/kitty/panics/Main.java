package kitty.panics;

import java.util.Objects;
import java.util.UUID;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) {
        // 声明变量
        String JSON_TYPE;
        String USER_NAME;
        UUID GEN_UUID;

        // 获取参数 1
        JSON_TYPE = args[0];
        // 获取参数 2
        USER_NAME = args[1];

        // 生成 UUID
        GEN_UUID = UUID.nameUUIDFromBytes(("OfflinePlayer:" + USER_NAME).getBytes(UTF_8));

        // 判断 JSON_TYPE
        if(Objects.equals(JSON_TYPE, "ops")) {
            // 转换并输出
            System.out.println("[\n"                                    +
                               "  {\n"                                  +
                               "    \"uuid\": \"" + GEN_UUID + "\",\n"  +
                               "    \"name\": \"" + USER_NAME + "\",\n" +
                               "    \"level\": 4,\n"                    +
                               "    \"bypassesPlayerLimit\": true\n"    +
                               "  }\n"                                  +
                               "]"
            );
        } else if(Objects.equals(JSON_TYPE, "wlist")) {
            // 转换并输出
            System.out.println(GEN_UUID);
        } else {
            System.out.print("=> 参数错误。");
        }
    }
}

package kitty.panics;

import java.util.Scanner;
import java.util.UUID;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) {
        // 获取输入
        System.out.println("=>> Please enter your User-Name:");
        Scanner input_user_name = new Scanner(System.in);
        String user_name = input_user_name.nextLine();

        // 转换并输出
        System.out.println(UUID.nameUUIDFromBytes(("OfflinePlayer:" + user_name).getBytes(UTF_8)));
    }
}

# USER-NAME to UUID

将用户名转换成 UUID，以方便将 HMCL 中的离线用户添加进 Minecraft-Server 白名单。

## 使用

1. `git clone --depth=1 git@github.com:kitty-panics/username2uuid.git`
2. `cd username2uuid/bin`
3. 生成配置文件
    + 生成 **ops.json**
        + `./username2uuid ops 用户名 > ops.json`
    + 生成 **whitelist.json**
        + `./username2uuid wlist 用户名> whitelist.json`

## 许可证

[GPL]

[GPL]: ./LICENSE

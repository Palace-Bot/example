package org.github.palace.bot.example;

import org.github.palace.bot.core.annotation.Command;
import org.github.palace.bot.core.annotation.CommandHandler;
import org.github.palace.bot.core.cli.CommandSender;

/**
 * @author jihongyuan
 * @date 2022/10/21 14:29
 */
@Command(primaryName = "hello")
public class AnnoHelloCommand {

    @CommandHandler
    public void handler(CommandSender commandSender) {
        commandSender.sendMessage(" 你好, anno ！我是PalaceBot！");
    }

}

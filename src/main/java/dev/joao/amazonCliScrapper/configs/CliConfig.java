package dev.joao.amazonCliScrapper.configs;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.jline.PromptProvider;


@Configuration
@ComponentScan("de.myapp.spring.shell")
public class CliConfig implements PromptProvider {

    @Override
    public final AttributedString getPrompt() {
        return new AttributedString("AmazonCliScrapper:>",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.BLUE));

    }
}

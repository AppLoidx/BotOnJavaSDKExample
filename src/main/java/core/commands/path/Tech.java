package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Tech extends Command {
    public Tech(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("Цель курса – на основе конструктора, изготовленного из экологически чистых материалов, научить детей сборке разнообразных механизмов и конструкций.\n" +
                "На занятиях ребенок сможет попробовать себя в роли самого настоящего конструктора и архитектора. Благодаря данным занятиям у ребенка будет развиваться пространственное мышление, воображение и логика. В процессе работы с конструктором у детей развивается мелкая моторика.На занятиях ребенок будет работать самостоятельно, создавая собственные конструкции и механизмы, а так же будет учиться работать в команде.", message.getPeerId());
    }
}

package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.commands.AskerKeyboard;
import vk.VKManager;

public class Lego extends Command {
    public Lego(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("Цели курса: научить детей обдуманно конструировать различные модели, познакомить с визуальным языком программирования, развить мелкую моторику рук.\nВ игровой форме научить детей работать с электромотором, датчиками и с различными элементами механики.\nКурс ориентирован на естественно-научный цикл начальной школы, поэтому собранные модели помогут детям понять, как устроен окружающий мир. \n\nЗнания, умения и навыки по окончании курса:\n" +
                "1. Умение собирать модели по схеме\n2. Развитие творческого мышления\n3. Умение программировать на визуальном языке\n4. Умение работать с мелкими деталями\n5. Навык коммуникации и командной работы\n6. Понимание принципа работы зубчатых передач", message.getPeerId());
    }
}

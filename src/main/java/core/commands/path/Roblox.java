package core.commands.path;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import vk.VKManager;

public class Roblox extends Command {
    public Roblox(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) throws ClientException, ApiException {
        new VKManager().sendMessage("Данный курс предназначен для возраста 9+ \nЧем программирование игр на платформе Roblox будет полезно Вашему ребенку?\n1. Ребенок получит базовые навыки программирования на языке LUA;\n2. Освоит принципы игрового движка;\n3. Разовьет воображение и пространственное мышление;\n4. Научится моделировать объекты и создавать анимации;\n5. Создаст свой собственный полноценный игровой мир и защитит свой проект перед другими ребятами.\n⠀Также создание игр на платформе Roblox учит детей внимательности и дисциплине. \nВсе эти преимущества пригодятся не только в программировании, но и в любой другой области - особенно на школьных уроках.", message.getPeerId());
    }
}

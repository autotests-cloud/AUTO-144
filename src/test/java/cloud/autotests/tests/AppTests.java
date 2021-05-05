package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Проверка регистрации на rbc.ru")
    void generatedTest() {
        step("Открыть web страницу \"rbc.ru\"", () -> {
            // todo
        });

        step("Найти кнопку \"Скрыть баннеры\"", () -> {
            // todo
        });

        step("Заполнить элемент формы \"e-mail\"", () -> {
            // todo
        });

        step("Заполнить вручную элемент формы \"Пароль\"", () -> {
            // todo
        });

        step("Заполнить вручную элемент формы \"Повторить пароль\"", () -> {
            // todo
        });

        step("Нажать чекбокс \"Я не робот\"", () -> {
            // todo
        });

        step("Нажать чекбокс \"Принимаю пользовательское соглашение...\"", () -> {
            // todo
        });

        step("Спозиционировать курсор мыши над кнопкой \"Зарегистрироваться\"", () -> {
            // todo
        });
    }
}
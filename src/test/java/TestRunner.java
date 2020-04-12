
import webdriver.Properties;

import io.qameta.allure.Allure;
import org.apache.logging.log4j.*;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.READ;

@CucumberOptions(
        strict = true,
        features = {"src/test/resources/features"},
        glue = {"steps"}
)

/**
 * Класс для запуска API-тестов
 */
public class TestRunner extends AbstractTestNGCucumberTests {

    private static Logger log;
    static {
        Properties.setProperties();
        log = LogManager.getLogger(TestRunner.class);
        log.debug("Настройки приложения установлены");
    }

    @BeforeClass
    public void beforeClass() {
        log.info("Запуск тестового класса");
    }

    @AfterClass
    public void afterClass() {
        log.info("класс капут");
//        getLog(System.getProperty("log.filename"));
    }

//    /**
//     *
//     * @param fileName String
//     */
//    private void getLog(String fileName)  {
//        try {
//            log.debug("Чтение логов тестирования из файла {}", fileName);
//            Allure.addAttachment("Лог-файл прогона тестов"
//                    ,"text/plain"
//                    , Files.newInputStream(Paths.get("logs/test.log"),READ)
//                    ,".txt"
//            );
//        } catch (IOException e) {
//            log.error("Ошибка чтения лога из файла {}: {}", fileName, e.getMessage());
//        }
//    }
}
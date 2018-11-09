import org.apache.logging.log4j.core.LoggerContext;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * test
 * Created by hyg on 2016-12-04.
 * Copyright by mofanghr
 */
public class GeneratorPG {
    static {
        try {
            String path= "/home/mofang/IdeaProjects/mofang-generator/src/main/resources/log4j2.xml";

            InputStream is = new FileInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String str = null;
            while (true) {
                str = reader.readLine();
                if(str!=null)
                    System.out.println(str);
                else
                    break;
            }
            is.close();
            File file = new File(path);
            LoggerContext initialize = LoggerContext.getContext();
            initialize.setConfigLocation(file.toURI());
        } catch (Exception ex) {
            System.err.println("Cannot Initialize log4j");
        }
    }
    public static void main(String[] args) throws Exception{

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("/home/mofang/IdeaProjects/mofang-generator/src/main/resources/mybatis/generatorConfig.pg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}

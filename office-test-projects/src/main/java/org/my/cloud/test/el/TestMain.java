package org.my.cloud.test.el;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Author Liq
 * @Date 2020-08-21 15:55
 */
public class TestMain {

//    public static void main(String[] args) {
//
//        String content="demo\n" +
//                "持续集成\n" +
//                "java1\n" +
//                "构建记录\n" +
//                "#16\n" +
//                "\n" +
//                "项目设置\n" +
//                "项目设置\n" +
//                "\n" +
//                "构建记录#16\n" +
//                "构建成功\n" +
//                "22 分钟 39 秒\n" +
//                "coding\n" +
//                "\n" +
//                "更新 Jenkinsfile\n" +
//                "coding 提交于 1 小时前\n" +
//                "构建过程\n" +
//                "改动记录\n" +
//                "测试报告\n" +
//                "构建产物\n" +
//                "构建快照\n" +
//                "开始检出成功ant -version...成功构建成功分析成功SonarQube Qu...成功自动化测试成功\n" +
//                "持续时间：6 分钟 28 秒\n" +
//                "查看完整日志\n" +
//                "sonar-scanner -Dsonar.projectKey=testts3 -Dsonar.sources=. -Dsonar.java.binaries=target/classes -Dsonar.tests=. -Dsonar.test.inclusions=**/*Test*/** -Dsonar.exclusions=**/*Test*/**Shell Script6 分钟 28 秒\n" +
//                "\n" +
//                "+ sonar-scanner -Dsonar.projectKey=testts3 -Dsonar.sources=. -Dsonar.java.binaries=target/classes -Dsonar.tests=. -Dsonar.test.inclusions=**/*Test*/** -Dsonar.exclusions=**/*Test*/**\n" +
//                "\n" +
//                "INFO: Scanner configuration file: /home/jenkins/sonarqubescanner/conf/sonar-scanner.properties\n" +
//                "\n" +
//                "INFO: Project root configuration file: NONE\n" +
//                "\n" +
//                "INFO: SonarScanner 4.3.0.2102\n" +
//                "\n" +
//                "INFO: Java 1.8.0_222 Oracle Corporation (64-bit)\n" +
//                "\n" +
//                "INFO: Linux 3.10.0-693.el7.x86_64 amd64\n" +
//                "\n" +
//                "INFO: User cache: /home/jenkins/.sonar/cache\n" +
//                "\n" +
//                "INFO: Scanner configuration file: /home/jenkins/sonarqubescanner/conf/sonar-scanner.properties\n" +
//                "\n" +
//                "INFO: Project root configuration file: NONE\n" +
//                "\n" +
//                "INFO: Analyzing on SonarQube server 7.9.1\n" +
//                "\n" +
//                "INFO: Default locale: \"en_US\", source code encoding: \"UTF-8\"\n" +
//                "\n" +
//                "WARN: SonarScanner will require Java 11+ to run starting in SonarQube 8.x\n" +
//                "\n" +
//                "INFO: Load global settings\n" +
//                "\n" +
//                "INFO: Load global settings (done) | time=607ms\n" +
//                "\n" +
//                "INFO: Server id: 2EEEA6E1-AXQJyUay-7sTIYGH6_ED\n" +
//                "\n" +
//                "INFO: User cache: /home/jenkins/.sonar/cache\n" +
//                "\n" +
//                "INFO: Load/download plugins\n" +
//                "\n" +
//                "INFO: Load plugins index\n" +
//                "\n" +
//                "INFO: Load plugins index (done) | time=541ms\n" +
//                "\n" +
//                "INFO: Plugin [l10nzh] defines 'l10nen' as base plugin. This metadata can be removed from manifest of l10n plugins since version 5.2.\n" +
//                "\n" +
//                "INFO: Load/download plugins (done) | time=296123ms\n" +
//                "\n" +
//                "INFO: Process project properties\n" +
//                "\n" +
//                "INFO: Execute project builders\n" +
//                "\n" +
//                "INFO: Execute project builders (done) | time=6ms\n" +
//                "\n" +
//                "INFO: Project key: testts3\n" +
//                "\n" +
//                "INFO: Base dir: /home/jenkins/agent/workspace/cci-70-656675\n" +
//                "\n" +
//                "INFO: Working dir: /home/jenkins/agent/workspace/cci-70-656675/.scannerwork\n" +
//                "\n" +
//                "INFO: Load project settings for component key: 'testts3'\n" +
//                "\n" +
//                "INFO: Load project settings for component key: 'testts3' (done) | time=531ms\n" +
//                "\n" +
//                "INFO: Load quality profiles\n" +
//                "\n" +
//                "INFO: Load quality profiles (done) | time=560ms\n" +
//                "\n" +
//                "INFO: Detected Jenkins\n" +
//                "\n" +
//                "INFO: Load active rules\n" +
//                "\n" +
//                "INFO: Load active rules (done) | time=8794ms\n" +
//                "\n" +
//                "INFO: Indexing files...\n" +
//                "\n" +
//                "INFO: Project configuration:\n" +
//                "\n" +
//                "INFO:   Excluded sources: **/*Test*/**, **/*Test*/**\n" +
//                "\n" +
//                "INFO:   Included tests: **/*Test*/**\n" +
//                "\n" +
//                "INFO: 13 files indexed\n" +
//                "\n" +
//                "INFO: 0 files ignored because of inclusion/exclusion patterns\n" +
//                "\n" +
//                "INFO: 0 files ignored because of scm ignore settings\n" +
//                "\n" +
//                "INFO: Quality profile for java: Sonar way\n" +
//                "\n" +
//                "INFO: Quality profile for jsp: FindBugs Security JSP\n" +
//                "\n" +
//                "INFO: Quality profile for xml: Sonar way\n" +
//                "\n" +
//                "INFO: ------------- Run sensors on module testts3\n" +
//                "\n" +
//                "INFO: Load metrics repository\n" +
//                "\n" +
//                "INFO: Load metrics repository (done) | time=482ms\n" +
//                "\n" +
//                "INFO: Sensor JavaSquidSensor [java]\n" +
//                "\n" +
//                "INFO: Configured Java source version (sonar.java.source): none\n" +
//                "\n" +
//                "INFO: JavaClasspath initialization\n" +
//                "\n" +
//                "WARN: Bytecode of dependencies was not provided for analysis of source files, you might end up with less precise results. Bytecode can be provided using sonar.java.libraries property.\n" +
//                "\n" +
//                "INFO: JavaClasspath initialization (done) | time=13ms\n" +
//                "\n" +
//                "INFO: JavaTestClasspath initialization\n" +
//                "\n" +
//                "INFO: JavaTestClasspath initialization (done) | time=0ms\n" +
//                "\n" +
//                "INFO: Java Main Files AST scan\n" +
//                "\n" +
//                "INFO: 5 source files to be analyzed\n" +
//                "\n" +
//                "INFO: Load project repositories\n" +
//                "\n" +
//                "INFO: Load project repositories (done) | time=487ms\n" +
//                "\n" +
//                "WARN: Classes not found during the analysis : [org.springframework.context.support.PropertySourcesPlaceholderConfigurer, org.springframework.web.bind.annotation.RequestMethod, org.springframework.web.multipart.commons.CommonsMultipartResolver, org.springframework.web.servlet.ModelAndView, org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry, org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter, org.springframework.web.servlet.view.InternalResourceViewResolver]\n" +
//                "\n" +
//                "INFO: 5/5 source files have been analyzed\n" +
//                "\n" +
//                "INFO: Java Main Files AST scan (done) | time=1534ms\n" +
//                "\n" +
//                "INFO: Java Test Files AST scan\n" +
//                "\n" +
//                "INFO: 0 source files to be analyzed\n" +
//                "\n" +
//                "INFO: Java Test Files AST scan (done) | time=1ms\n" +
//                "\n" +
//                "INFO: Sensor JavaSquidSensor [java] (done) | time=2471ms\n" +
//                "\n" +
//                "INFO: 0/0 source files have been analyzed\n" +
//                "\n" +
//                "INFO: Sensor PmdSensor [pmd]\n" +
//                "\n" +
//                "INFO: Sensor PmdSensor [pmd] (done) | time=2ms\n" +
//                "\n" +
//                "INFO: Sensor SurefireSensor [java]\n" +
//                "\n" +
//                "INFO: parsing [/home/jenkins/agent/workspace/cci-70-656675/target/surefire-reports]\n" +
//                "\n" +
//                "INFO: Sensor SurefireSensor [java] (done) | time=45ms\n" +
//                "\n" +
//                "INFO: Sensor JaCoCoSensor [java]\n" +
//                "\n" +
//                "INFO: Sensor JaCoCoSensor [java] (done) | time=1ms\n" +
//                "\n" +
//                "INFO: Sensor JavaXmlSensor [java]\n" +
//                "\n" +
//                "INFO: 1 source files to be analyzed\n" +
//                "\n" +
//                "INFO: Sensor JavaXmlSensor [java] (done) | time=249ms\n" +
//                "\n" +
//                "INFO: 1/1 source files have been analyzed\n" +
//                "\n" +
//                "INFO: Sensor HTML [web]\n" +
//                "\n" +
//                "INFO: Sensor HTML [web] (done) | time=76ms\n" +
//                "\n" +
//                "INFO: Sensor XML Sensor [xml]\n" +
//                "\n" +
//                "INFO: 1 source files to be analyzed\n" +
//                "\n" +
//                "INFO: Sensor XML Sensor [xml] (done) | time=430ms\n" +
//                "\n" +
//                "INFO: Sensor CheckstyleSensor [checkstyle]\n" +
//                "\n" +
//                "INFO: 1/1 source files have been analyzed\n" +
//                "\n" +
//                "INFO: Checkstyle output report: /home/jenkins/agent/workspace/cci-70-656675/.scannerwork/checkstyle-result.xml\n" +
//                "\n" +
//                "INFO: Checkstyle configuration: /home/jenkins/agent/workspace/cci-70-656675/.scannerwork/checkstyle.xml\n" +
//                "\n" +
//                "INFO: Checkstyle charset: UTF-8\n" +
//                "\n" +
//                "INFO: Sensor CheckstyleSensor [checkstyle] (done) | time=351ms\n" +
//                "\n" +
//                "INFO: Sensor JaCoCo XML Report Importer [jacoco]\n" +
//                "\n" +
//                "INFO: Sensor JaCoCo XML Report Importer [jacoco] (done) | time=9ms\n" +
//                "\n" +
//                "INFO: Sensor FindBugs Sensor [findbugs]\n" +
//                "\n" +
//                "WARN: JSP files were found in the current (sub)project (/home/jenkins/agent/workspace/cci-70-656675) but FindBugs requires their precompiled form. For more information on how to configure JSP precompilation : https://github.com/find-sec-bugs/find-sec-bugs/wiki/JSP-precompilation\n" +
//                "\n" +
//                "INFO: Loading findbugs plugin: /home/jenkins/agent/workspace/cci-70-656675/.scannerwork/findbugs/findsecbugs-plugin.jar\n" +
//                "\n" +
//                "INFO: Findbugs output report: /home/jenkins/agent/workspace/cci-70-656675/.scannerwork/findbugs-result.xml\n" +
//                "\n" +
//                "The following classes needed for analysis were missing:\n" +
//                "\n" +
//                "  org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer\n" +
//                "\n" +
//                "  org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter\n" +
//                "\n" +
//                "  org.springframework.context.support.PropertySourcesPlaceholderConfigurer\n" +
//                "\n" +
//                "  org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry\n" +
//                "\n" +
//                "  org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration\n" +
//                "\n" +
//                "  org.springframework.web.servlet.view.InternalResourceViewResolver\n" +
//                "\n" +
//                "  org.springframework.web.multipart.commons.CommonsMultipartResolver\n" +
//                "\n" +
//                "  org.springframework.web.servlet.ModelAndView\n" +
//                "\n" +
//                "INFO: Sensor FindBugs Sensor [findbugs] (done) | time=5148ms\n" +
//                "\n" +
//                "INFO: ------------- Run sensors on project\n" +
//                "\n" +
//                "INFO: Sensor Zero Coverage Sensor\n" +
//                "\n" +
//                "INFO: Sensor Zero Coverage Sensor (done) | time=16ms\n" +
//                "\n" +
//                "INFO: Sensor Java CPD Block Indexer\n" +
//                "\n" +
//                "INFO: Sensor Java CPD Block Indexer (done) | time=27ms\n" +
//                "\n" +
//                "INFO: Calculating CPD for 6 files\n" +
//                "\n" +
//                "INFO: CPD calculation finished\n" +
//                "\n" +
//                "INFO: Analysis report generated in 109ms, dir size=95 KB\n" +
//                "\n" +
//                "INFO: Analysis report compressed in 22ms, zip size=25 KB\n" +
//                "\n" +
//                "INFO: Analysis report uploaded in 508ms\n" +
//                "\n" +
//                "INFO: ANALYSIS SUCCESSFUL, you can browse http://103.21.117.221:30327/dashboard?id=testts3\n" +
//                "\n" +
//                "INFO: Note that you will be able to access the updated dashboard once the server has processed the submitted analysis report\n" +
//                "\n" +
//                "INFO: More about the report processing at http://103.21.117.221:30327/api/ce/task?id=AXQP3mg7-7sTIYGH7COk\n" +
//                "\n" +
//                "INFO: Analysis total time: 23.482 s\n" +
//                "\n" +
//                "INFO: ------------------------------------------------------------------------\n" +
//                "\n" +
//                "INFO: EXECUTION SUCCESS\n" +
//                "\n" +
//                "INFO: ------------------------------------------------------------------------\n" +
//                "\n" +
//                "INFO: Total time: 6:27.706s\n" +
//                "\n" +
//                "INFO: Final Memory: 30M/523M\n" +
//                "\n" +
//                "INFO: ------------------------------------------------------------------------\n" +
//                "\n";
//
////        String pattern = "(" + sonarHost + "/dashboard\\?id=)[\\S]*";
////        String pattern = "(http://(.*?)/dashboard\\?id=)[\\S]*";
//        String pattern = "(/dashboard\\?id=)[\\S]*";
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(content);
//        if (m.find()) {
//            String group = m.group();
//            System.out.println("grop "+group);
//        }
//
//    }


    public static void main(String[] args) {
        String s = "codingcorp-docker.pkg.csl.anchnet.com/demo/java2";
//        String pattern = "(.*?)-docker";
        String pattern = "(.+(?=-docker))";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if(m.find()){
            System.out.println(m.group());
        }
    }
}

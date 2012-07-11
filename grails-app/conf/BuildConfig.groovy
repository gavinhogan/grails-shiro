grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.source.level = 1.6

grails.project.dependency.resolution = {
    inherits "global"
    log "warn" 
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        compile 'org.apache.shiro:shiro-core:1.2.0',
                'org.apache.shiro:shiro-web:1.2.0',
                'org.apache.shiro:shiro-ehcache:1.2.0',
                'org.apache.shiro:shiro-quartz:1.2.0',
                'org.apache.shiro:shiro-spring:1.2.0',
                'org.apache.shiro:shiro-cas:1.2.0', {
            excludes 'ejb', 'jsf-api', 'jms', 'connector-api', 'ehcache-core', 'slf4j-api'
        }
    }
    plugins {
        build(":release:2.0.3") {
            export = false
        }
    }
}

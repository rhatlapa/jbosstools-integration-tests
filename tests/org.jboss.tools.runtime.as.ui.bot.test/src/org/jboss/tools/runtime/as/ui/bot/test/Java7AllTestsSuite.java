package org.jboss.tools.runtime.as.ui.bot.test;

import org.jboss.tools.runtime.as.ui.bot.test.detector.RuntimeDownload;
import org.jboss.tools.runtime.as.ui.bot.test.detector.RuntimeDuplications;
import org.jboss.tools.runtime.as.ui.bot.test.detector.ServerWithSeam;
import org.jboss.tools.runtime.as.ui.bot.test.detector.seam.seam22.CheckSeam22;
import org.jboss.tools.runtime.as.ui.bot.test.detector.seam.seam22.DetectSeam22;
import org.jboss.tools.runtime.as.ui.bot.test.detector.seam.seam23.CheckSeam23;
import org.jboss.tools.runtime.as.ui.bot.test.detector.seam.seam23.DetectSeam23;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap4.CheckEAP4Seam;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap4.DetectEAP4;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap4.OperateEAP4;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap52.CheckEAP52Seam;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap52.DetectEAP52;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap52.OperateEAP52;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap60.DetectEAP60;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap60.OperateEAP60;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap61.DetectEAP61;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.eap61.OperateEAP61;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.epp4.CheckEPP4Seam;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.epp4.DetectEPP4;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.epp4.OperateEPP4;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.jboss7.DetectJBoss7;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.jboss7.OperateJBoss7;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.jpp6.DetectJPP6;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.jpp6.OperateJPP6;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.soap53.CheckSOAP53Seam;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.soap53.DetectSOAP53;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.soap53.OperateSOAP53;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.soap53.standalone.DetectSOAPStandalone53;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.soap53.standalone.OperateSOAPStandalone53;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly8.DetectWildFly8;
import org.jboss.tools.runtime.as.ui.bot.test.detector.server.wildfly8.OperateWildFly8;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Tests with Java SE 1.7 requirement
 * 
 * @author Petr Suchy
 *
 */
@RunWith(JBTSuite.class)
@Suite.SuiteClasses({

		RuntimeDuplications.class,
		ServerWithSeam.class,
		RuntimeDownload.class,
		
		DetectWildFly8.class,
		OperateWildFly8.class,
		
		DetectJBoss7.class,
		OperateJBoss7.class,
		
		DetectEAP60.class,
		OperateEAP60.class,
		
		DetectEAP61.class,
		OperateEAP61.class,
		
		DetectEAP52.class, 
		CheckEAP52Seam.class,
		OperateEAP52.class, 
		
		DetectEAP4.class, 
		CheckEAP4Seam.class,
		OperateEAP4.class,
		
		DetectEPP4.class, 
		CheckEPP4Seam.class,
		OperateEPP4.class,
		
		DetectJPP6.class, 
		OperateJPP6.class,
		
		DetectSOAP53.class, 
		CheckSOAP53Seam.class,
		OperateSOAP53.class, 
		DetectSOAPStandalone53.class, 
		OperateSOAPStandalone53.class,
		
		DetectSeam22.class,
		CheckSeam22.class,
		DetectSeam23.class,
		CheckSeam23.class
		
})
public class Java7AllTestsSuite {

}

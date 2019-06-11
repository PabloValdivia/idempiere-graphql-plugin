package cz.naseukoly.idempiere.graphql;
import org.adempiere.plugin.utils.Incremental2PackActivator;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator extends Incremental2PackActivator implements BundleActivator {
	  private static BundleContext bundleContext;
	  
	  @Override
	  public void start(final BundleContext context) throws Exception {
	    Activator.bundleContext = context;
	    super.start(context);
	  }
	  
	  @Override
	  public void stop(final BundleContext context) throws Exception {
	    Activator.bundleContext = null;
	    super.stop(context);
	  }
}

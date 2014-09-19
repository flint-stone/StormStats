import java.lang.management.ManagementFactory;

import com.sun.management.OperatingSystemMXBean;


public class ProfileUpdate implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		OperatingSystemMXBean bean=(OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
		while(true){
			//update cpu usage
			Slave.prf.setCpu_usage(bean.getSystemCpuLoad());
			Slave.prf.setBandwidth_in(0);
			Slave.prf.setBandwidth_out(0);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

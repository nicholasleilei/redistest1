package redistest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Jedis jedis = new Jedis("192.168.199.141",6379); // String age
		 * =jedis.get("age"); String name=jedis.hget("user", "name");
		 * System.out.println(name);
		 * 
		 * jedis.close();
		 * 
		 */
		/*
		 * Set<HostAndPort> nodes = new HashSet<>(); nodes.add(new
		 * HostAndPort("192.168.199.141", 8001)); nodes.add(new
		 * HostAndPort("192.168.199.141", 8002)); nodes.add(new
		 * HostAndPort("192.168.199.141", 8003)); nodes.add(new
		 * HostAndPort("192.168.199.141", 8004)); nodes.add(new
		 * HostAndPort("192.168.199.141", 8005)); nodes.add(new
		 * HostAndPort("192.168.199.141", 8006)); JedisCluster jc = new
		 * JedisCluster(nodes);
		 */
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-cluster.xml");
		JedisCluster jc = ctx.getBean(JedisCluster.class);
		String name = jc.get("name");
		System.out.println(name);
	}

}

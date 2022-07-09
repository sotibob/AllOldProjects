package com.control;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Player;
import com.to.Team;

public class HibernateMain {

	public static void main(String[] args) {
		try {
			Configuration configuration = new Configuration().configure();
			configuration.addAnnotatedClass(com.to.Player.class);
			configuration.addAnnotatedClass(com.to.Team.class);
			StandardServiceRegistryBuilder builder = 
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			SessionFactory factory = configuration.buildSessionFactory(builder.build());
			
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Team t1 = new Team("India");
			Team t2 = new Team("RCB");
			Team t3 = new Team("Delhi");
			
			Player p = new Player();
			p.setAge(28);
			p.setPlayerName("Virat Kolhi");
			p.getTeamList().add(t1);
			p.getTeamList().add(t2);
			p.getTeamList().add(t3);
			session.save(t1);
			session.save(t2);
			session.save(t3);
			session.save(p);
			
			/*Query query = session.createQuery("from Player where teamName=:team order by age asc");
			query.setString("team", "India");
			List<Player> playerList = query.list();
			System.out.println("Player Details");
			for (Player p : playerList) {
				System.out.println(p);
			}
			
			Player p1 = new Player(10, "Virat", "India", 30);
			Player p2 = new Player(20, "Rohit", "India", 35);
			session.save(p1);
			session.save(p2);
			
			Player p = session.get(Player.class, 10);
			System.out.println("The details : " + p.toString());
			p.setPlayerName("Dhoni");
			p.setAge(37);
			
			session.delete(p);
			
			Player p1 = new Player("Raheem", "India", 40);
			Player p2 = new Player("Rohit", "India", 35);
			session.save(p1);
			session.save(p2);*/
			
			transaction.commit();
			session.close();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}

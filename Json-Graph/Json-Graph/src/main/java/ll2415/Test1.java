package ll2415;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

import javax.lang.model.util.SimpleElementVisitor6;
import javax.management.loading.PrivateClassLoader;
import javax.sql.rowset.Predicate;
import javax.swing.*;

@SuppressWarnings("serial")
public class Test1 extends  JPanel{
	List<SimpleEntry<Integer, Integer>> points = new ArrayList();
	List<SimpleEntry<Integer, Integer>> lines1 = new ArrayList();
	List<SimpleEntry<Integer, Integer>> lines2 = new ArrayList();
	List<SimpleEntry<Integer, Integer>> transfer1 = new ArrayList();
	List<SimpleEntry<Integer, Integer>> transfer2 = new ArrayList();
	List<SimpleEntry<Integer, Integer>> visit_line1 = new ArrayList();
	List<SimpleEntry<Integer, Integer>> visit_line2 = new ArrayList();
	List<SimpleEntry<Integer, Integer>> path   = new ArrayList();
	public Test1(Test1 p) {
		// TODO Auto-generated constructor stub
		this.lines1 = p.getLines1();
		this.lines2 = p.getLines2();
		this.points = p.getPoints();
	}

	public Test1() {
		// TODO Auto-generated constructor stub
	}

	public List<SimpleEntry<Integer, Integer>> getLines1() {
		return lines1;
	}

	public void setLines1(List<SimpleEntry<Integer, Integer>> lines1) {
		this.lines1 = lines1;
	}

	public List<SimpleEntry<Integer, Integer>> getLines2() {
		return lines2;
	}

	public void setLines2(List<SimpleEntry<Integer, Integer>> lines2) {
		this.lines2 = lines2;
	}

	

	public List<SimpleEntry<Integer, Integer>> getPoints() {
		return points;
	}

	public void setPoints(List<SimpleEntry<Integer, Integer>> points) {
		this.points = points;
	}

	public void paintComponent(Graphics g){
		//super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.white);
		for(SimpleEntry <Integer,Integer> point:points)
		{
			g.fillOval(point.getKey(), point.getValue(), 4, 4);
		}
		g.setColor(Color.white);
		for(int i = 0;i<transfer1.size();i++)
		{
			g.drawLine(transfer1.get(i).getKey(),transfer1.get(i).getValue(),transfer2.get(i).getKey(),transfer2.get(i).getValue());
		}
		
		g.setColor(Color.yellow);
		for(SimpleEntry <Integer,Integer> p:path)
		{
			g.fillOval(p.getKey(), p.getValue(), 2, 2);
		}
		for(int i = 0;i<visit_line1.size();i++)
		{
			g.drawLine(visit_line1.get(i).getKey(),visit_line1.get(i).getValue(),visit_line2.get(i).getKey(),visit_line2.get(i).getValue());
		}
			
		g.setColor(Color.red);
		for(int i = 0;i<lines1.size();i++)
		{
			g.drawLine(lines1.get(i).getKey(),lines1.get(i).getValue(),lines2.get(i).getKey(),lines2.get(i).getValue());
		}
		
	}

	public List<SimpleEntry<Integer, Integer>> getPath() {
		return path;
	}

	public void setPath(List<SimpleEntry<Integer, Integer>> path) {
		this.path = path;
	}

	public List<SimpleEntry<Integer, Integer>> getTransfer1() {
		return transfer1;
	}

	public void setTransfer1(List<SimpleEntry<Integer, Integer>> transfer1) {
		this.transfer1 = transfer1;
	}

	public List<SimpleEntry<Integer, Integer>> getTransfer2() {
		return transfer2;
	}

	public void setTransfer2(List<SimpleEntry<Integer, Integer>> transfer2) {
		this.transfer2 = transfer2;
	}

	public List<SimpleEntry<Integer, Integer>> getVisit_line1() {
		return visit_line1;
	}

	public void setVisit_line1(List<SimpleEntry<Integer, Integer>> visit_line1) {
		this.visit_line1 = visit_line1;
	}

	public List<SimpleEntry<Integer, Integer>> getVisit_line2() {
		return visit_line2;
	}

	public void setVisit_line2(List<SimpleEntry<Integer, Integer>> visit_line2) {
		this.visit_line2 = visit_line2;
	}
}

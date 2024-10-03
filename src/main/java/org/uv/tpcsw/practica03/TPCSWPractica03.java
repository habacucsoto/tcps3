package org.uv.tpcsw.practica03;

import org.hibernate.Session;

public class TPCSWPractica03 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SessionionFatory sf= HibernateUtil.getSessionFactory();
    }
}

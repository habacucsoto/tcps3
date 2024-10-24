package org.uv.tpcsw.practica03;

import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TPCSWPractica03 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Empleado empleado = new Empleado();
        empleado.setClave(2);
        empleado.setNombre("Habacuc hibernate");
        empleado.setDireccion("Calle 2 Av Pinos");
        empleado.setTelefono("274154465");
        
        
//        Departamento departamento = new Departamento();
//        departamento.setNombre("habacuc14oct");
        
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        
        Departamento dep = session.get(Departamento.class,1L);
        
        if (dep != null) {
            System.out.println("Clave: " + dep.getClave() + "Nom: " + dep.getNombre());
            Set<Empleado> lstEmpleado = dep.getEmpleados();
            for (Empleado empleado1 : lstEmpleado) {
                System.out.println("clave" + empleado1.getClave());
            }
//        empleado.setDepto(dep);
//        session.save(empleado);
        }
//        session.save(departamento);
        t.commit();
    }
}

package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import util.JpaUtil;

public class GestaoGeralDAOIpml implements GestaoGeralDAO {

	@Override
	public void linha() {
		for (int i = 0; i < 93; i++) {
			System.out.print("=");
		}
		System.out.println("");
	}

	@Override
	public void top() {
		linha();
		for (int i = 0; i < 60; i++) {
			if (i == 0) {
				System.out.print("|");
			} else if (i == 30) {
				System.out.print(" BEM VINDO! AO GESTOR DE SORVETES! ");
			} else if (i == 59) {
				System.out.print("|\n");
			} else {
				System.out.print("*");
			}
		}
		linha();
	}

	@Override
	public void inserir(Object obj) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		ent.merge(obj);
		tx.commit();
		ent.close();
		System.out.println("Inserção efetuada com sucesso!");
	}

	@Override
	public void remover(Class classe, Object primaryKey) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		Object obj = ent.find(classe, primaryKey);
		tx.begin();
		ent.remove(obj);
		tx.commit();
		ent.close();
		System.out.println(" Descartado! ");
	}

	@Override
	public List buscarTodos(Object obj) {
		EntityManager ent = JpaUtil.getEntityManager();
		Query query = ent.createQuery("from " + obj.getClass().getSimpleName());
		List listas = query.getResultList();
		return listas;
	}

	@Override
	public Object buscarUmObjetoEspecifico(Class classe, Object chave) {
		EntityManager ent = JpaUtil.getEntityManager();
		return ent.find(classe, chave);
	}

}

package dao;

import java.util.List;

public interface GestaoGeralDAO {
	public void linha();

	public void top();

	public void inserir(Object obj);

	public void remover(Class classe, Object primaryKey);

	public List buscarTodos(Object obj);

	public Object buscarUmObjetoEspecifico(Class classe, Object chave);
}

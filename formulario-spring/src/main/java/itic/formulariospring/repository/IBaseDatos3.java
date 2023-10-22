package itic.formulariospring.repository;

import java.util.ArrayList;

import itic.formulariospring.bean.Libro;

public interface IBaseDatos3 {
	public void inserta(Libro libro);
	public void borrar(int id);
	public void modifica(Libro libro);
	public Libro getLibro(int id);
	public ArrayList<Libro> getLibros();
	public boolean compruebaUsuario(String usuario, String password);
}

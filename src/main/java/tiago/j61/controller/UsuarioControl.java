package tiago.j61.controller;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import org.jdesktop.observablecollections.ObservableCollections;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tiago.j61.dao.UsuarioDao;
import tiago.j61.model.Usuario;

/**
 * JavaFX App
 */
public class UsuarioControl extends Application {

	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
	private static Scene scene;
	private List<Usuario> usuarios;
	private Usuario usuario;
	private UsuarioDao usuarioDao;

	public UsuarioControl() {
		usuarioDao = new UsuarioDao();
		usuarios = ObservableCollections.observableList(new ArrayList<Usuario>());
		novo();
		pesquisar();
	}

	private void pesquisar() {
		usuarios.clear();
		usuarios.addAll(usuarioDao.pesquisar(usuario));
	}

	private void novo() {
		setUsuario(new Usuario());
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
package com.xsquaredsoft.thefinaljump;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import scenes.Gameplay;
import scenes.MainMenu;

public class GameMain extends Game {
	private SpriteBatch batch;

	public static PlayServices playServices;
//	AdHandler handler;
//	Boolean toggle;



	public GameMain(PlayServices playServices)
	{
		this.playServices = playServices;
		//playServices.signIn();
	}
	public GameMain()
	{

	}

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MainMenu(this));


	}

	@Override
	public void render () {
		super.render();
	}

	public SpriteBatch getBatch() {
		return this.batch;
	}




}

package com.jstnf.bentoboxtestaddon;

import world.bentobox.bentobox.api.addons.Addon;

public class Main extends Addon
{
	@Override
	public void onEnable()
	{
		getLogger().info("Hello! This is a test BentoBox addon!");
	}

	@Override
	public void onDisable()
	{

	}
}
package com.example.pvz.layer;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGSize;

public class BaseLayer extends CCLayer {
	protected CGSize winSize;

	public BaseLayer() {
		winSize = CCDirector.sharedDirector().getWinSize();
	}

}

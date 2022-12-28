package com.libqa.pattern.template.application;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public abstract class HouseTemplate {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//template method, final so subclasses can't override
	public final void buildHouse(){
		buildFoundation();	// 건물 기초를 짓는다.
		buildPillars();		// 건물 기둥을 짓는다.
		buildWalls();		// 건물 벽을 짓는다.
		buildWindows();		// 건물 창호를 짓는다.

		logger.info("buildHouse : House is built.");
	}

	//default implementation
	private void buildWindows() {
		logger.info("Building Glass Windows");
	}

	//methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();

	private void buildFoundation() {
		logger.info("Building foundation with cement,iron rods and sand");
	}
}

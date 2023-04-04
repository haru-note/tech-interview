package net.harunote.pattern.template.application;

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
		buildWindows();		// 건물 창호를 만든다.

		logger.info("집이 완공되었다.");
	}

	//default implementation
	private void buildWindows() {
		logger.info("창호가 완성 되었다.");
	}

	//methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();

	private void buildFoundation() {
		logger.info("건물의 기초 공사가 시작 되었다.");
	}
}

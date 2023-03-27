package net.harunote.pattern.template.application;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class GlassHouse extends HouseTemplate {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void buildWalls() {
		logger.info("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		logger.info("Building Pillars with glass coating");
	}
}
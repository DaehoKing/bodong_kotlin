package com.pi.big.bodong

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BodongApplication

fun main(args: Array<String>) {
	runApplication<BodongApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}

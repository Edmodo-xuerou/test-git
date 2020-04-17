package com.nd.selenium_java;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

        HelloWorld helloWorld = new HelloWorld();

@BeforeAll
static void beforeAll() {
        System.out.println("-----------before all----------------");
        }

@BeforeEach
    void setUp() {
            System.out.println("---------------setup-------------------");
            }

@AfterEach
    void tearDown() {
            System.out.println("---------------teardown------------");
            }

@AfterAll
static void afterAll() {
        System.out.println("----------AfterAll-------------");
        }

@Test
    void count() {
            assertEquals(helloWorld.count(),5);
            }

@Test
@Disabled("这条用例暂时跑不过，忽略")
    void disable(){
            assertEquals("2","1");
            }

@Test
@DisplayName("描述测试用例")
    void displayname(){

            }

@Test
@DisplayName("运行一组断言")
    void assertall(){
            assertAll("groupassert",
            ()->assertEquals(1+2,3),
            ()->assertTrue(3>1));
            }

@Test
    void insertParameter(){
            helloWorld.count();
            }

            }
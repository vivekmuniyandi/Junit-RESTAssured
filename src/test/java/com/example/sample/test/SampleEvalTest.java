package com.example.sample.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;
import com.marklogic.client.DatabaseClientFactory.DigestAuthContext;
import com.marklogic.client.eval.ServerEvaluationCall;

public class SampleEvalTest {
  static DatabaseClient client = null;

  @BeforeClass
  public static void beforeClass() {
    client = DatabaseClientFactory.newClient("localhost", 8000, new DigestAuthContext("admin", "admin"));
  }

  @Test
  public void serverEvalTest() {
    ServerEvaluationCall query = client.newServerEval().javascript("1+1");
    int answer = query.eval().next().getNumber().intValue();
    assertEquals("Return should be 2", 2, answer);
  }

  @AfterClass
  public static void afterClass() {
    client.release();
  }
}

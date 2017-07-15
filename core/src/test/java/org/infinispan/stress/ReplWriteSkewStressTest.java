package org.infinispan.stress;

import org.infinispan.configuration.cache.CacheMode;
import org.testng.annotations.Test;

/**
 * @author Pedro Ruivo
 * @since 7.0
 */
@Test(groups = "stress", testName = "stress.ReplWriteSkewStressTest", timeOut = 15*60*1000)
public class ReplWriteSkewStressTest extends AbstractWriteSkewStressTest {

   @Override
   protected CacheMode getCacheMode() {
      return CacheMode.REPL_SYNC;
   }
}

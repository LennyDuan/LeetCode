import { twoSum } from '../../app/easy/1twosum.js';
import { assert } from 'chai';

describe('twoSum.js', () => {
  describe('twoSum', () => {
    it('should complete return 0', async () => {
      const expect = 0;
      const result = twoSum(0, 0);
      assert.deepEqual(expect, result);      
    });
  });
});

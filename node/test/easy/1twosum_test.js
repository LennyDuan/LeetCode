import 'babel-polyfill'
import { twoSum } from '../../app/easy/1twosum.js';
import { assert } from 'chai';

describe('twoSum.js', () => {
  describe('twoSum', () => {
    it('should complete return [1, 2]', async () => {
      const expect = [1, 2];
      const arr = [3, 2, 4];
      const num = 6;
      const result = twoSum(arr, num);
      assert.deepEqual(expect, result);
    });
  });
});

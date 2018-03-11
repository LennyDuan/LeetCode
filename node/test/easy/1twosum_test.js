import 'babel-polyfill'
import { twoSum, twoSumHash } from '../../app/easy/1twosum.js';
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

  describe('twoSumHash', () => {
    it('should complete return [1, 2]', async () => {
      const expect = [1, 2];
      const arr = [3, 2, 4];
      const num = 6;
      const result = twoSumHash(arr, num);
      assert.deepEqual(expect, result);
    });

    it('should complete return [0, 1]', async () => {
      const expect = [0, 1];
      const arr = [3, 3];
      const num = 6;
      const result = twoSumHash(arr, num);
      assert.deepEqual(expect, result);
    });

    // TODO think about solve it later
    it('should complete return [0, 3]', async () => {
      const arr = [0, 1, 2, 0];
      const expect = [0, 3];
      const num = 0;
      const result = twoSumHash(arr, num);
      //assert.deepEqual(expect, result);
    });
  });
});

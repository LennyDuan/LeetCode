import { removeDuplicates } from '../../app/medium/80removeduplicatesfromsortedarray2';
import { assert } from 'chai';

describe('medium', () => {
  describe('80removeduplicatesfromsortedarray2', () => {
    describe('removeDuplicates', () => {
      it('should complete return length = 5', async () => {
        const expect = [1, 1, 2, 2, 3];
        const given = [1, 1, 1, 2, 2, 3];
        const actual = removeDuplicates(given);
        assert.deepEqual(expect, actual);
      });
    });
  });
});

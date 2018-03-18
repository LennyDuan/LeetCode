import { removeDuplicates } from '../../app/medium/80removeduplicatesfromsortedarray2';
import { assert } from 'chai';

describe('medium', () => {
  describe('80removeduplicatesfromsortedarray2', () => {
    describe('removeDuplicates', () => {
      it('should complete return length = 5', async () => {
        const expect = [1, 1, 2, 2, 3]
        const given = [1, 1, 1, 2, 2, 3];
        const actual = removeDuplicates(given);
        assert.deepEqual(expect, actual);
      });

      it('should complete return length = 2', async () => {
        const expect = [1, 1];
        const given = [1, 1];
        const actual = removeDuplicates(given);
        assert.deepEqual(expect, actual);
      });

      it('should complete return length = 4', async () => {
        const expect = [1, 1];
        const given = [1, 1, 1, 1];
        const actual = removeDuplicates(given);
        assert.deepEqual(expect, actual);
      });

      it('should complete return length = 2', async () => {
        const expect = [0, 0];
        const given = [0, 0, 0, 0, 0];
        const actual = removeDuplicates(given);
        assert.deepEqual(expect, actual);
      });
    });
  });
});

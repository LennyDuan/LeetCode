import { assert } from 'chai';

describe('util', () => {
  describe('array', () => {
    describe('array as stack', () => {
      it('Should behavior as stack', async () => {
        const stack = [1, 2, 3];
        stack.push(4);
        assert.deepEqual([1, 2, 3, 4], stack);

        stack.pop();
        assert.deepEqual([1, 2, 3], stack);
      });
    });
  });
});

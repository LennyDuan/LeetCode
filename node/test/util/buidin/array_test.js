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

      it('Should behavior as stack to pop top first', async () => {
        const stack = [1, 2, 3];
        stack.push(4);
        stack.push(5);
        stack.push(6);
        assert.deepEqual([1, 2, 3, 4, 5, 6], stack);

        stack.pop();
        assert.deepEqual([1, 2, 3, 4, 5], stack);

        const top = stack.pop();
        assert.deepEqual([1, 2, 3, 4], stack);
        assert.deepEqual(5, top);
      });
    });

    describe('array as queue', () => {
      it('Should behavior as queue', () => {
        const queue = [1, 2, 3];
        queue.push(4);
        assert.deepEqual([1, 2, 3, 4], queue);

        queue.shift();
        assert.deepEqual([2, 3, 4], queue);
      });

      it('Should behavior as queue to shift first', () => {
        const queue = [1, 2, 3];
        queue.push(4);
        assert.deepEqual([1, 2, 3, 4], queue);

        queue.shift();
        const first = queue.shift();
        assert.deepEqual([3, 4], queue);
        assert.deepEqual(2, first);
      });
    });
  });
});

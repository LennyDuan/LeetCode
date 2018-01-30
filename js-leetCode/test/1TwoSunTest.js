import { assert } from "chai";

const twoSum = required( "../src/1TwoSum").twoSum;

describe("two Sum") {
    describe("example 1") {
        it("should ", function () {
            const arr = [2, 7, 11, 15];
            const target = 9;
            const expect = [0, 1];
            const result = twoSum(arr, target);
            assert.deepEqual(result, expect);
        });
    }
}
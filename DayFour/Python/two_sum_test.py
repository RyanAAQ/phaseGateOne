from unittest import TestCase
from two_sum import *

class TestTheSumOfNumbers(TestCase):

    def testThatTheArrayIsReturnedAndIsCorrect(self):
        
        
        numbers = {1, 2, 3, 4, 5}
        target = 6
        actual = returnArray(numbers, target)
        expected = [1, 5]
        self.assertEqual(actual, expected)

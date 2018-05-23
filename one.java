package SorteOpgaver.ch16.aske1208_a_16_1;

import SorteOpgaver.ch16.LinkedIntList;
import SorteOpgaver.ch16.ListNode;

public class one
{
    LinkedIntList linkedIntList = new LinkedIntList();

    ListNode front = new ListNode();


    public void set(int index, int value) {
        ListNode current = front;

        for (int i = 0; i < index; i++)
        {
            if (i == index)
            {
                ListNode tempBack = current.next;

                current.next = new ListNode(value);
                current.next.next = tempBack;

            }else {
                current = current.next;
            }

        }
    }

    public void addNodeToList(int value, int index)
    {
            ListNode current = front;

            for (int i = 0; i < index; i++)
            {
                if (current.next == null)
                {
                    current.next = new ListNode(value);
                }else {
                    current = current.next;
                }
            }
        }
    }

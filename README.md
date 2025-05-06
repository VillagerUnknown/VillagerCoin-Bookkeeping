# VillagerUnknown's Bookkeeping for Villager Coin

_This is an addon mod for VillagerUnknown's Villager Coin._

Adds Bookkeeping items, like Receipts and Ledgers, to VillagerUnknown's Villager Coin to catalog financial transactions.

This is a fun and easy way for multiplayer servers to make their shopping districts and player transactions feel more realistic.

* Receipts allow players to create records of transactions through the crafting table.
* Ledgers allow players to catalog up to 100 receipts into an organized written book through the crafting table.

## Receipts

Receipts allow players to create records of transactions through the crafting table.

* Receipts are named after the player that crafted them, unless crafted by a crafter or custom named, as "Receipt from {PlayerName}".
_This allows players to easily provide a receipt after receiving a payment or making a purchase._
* Each Receipt includes the date created and the total of the coins in copper coins.
* Receipts from the same date stack and sum the total in copper coins.
_This allows players to easily sum up their totals for the day from the same seller._
* At the bottom of each receipt is a thank-you message. The default message is, "Thank you for shopping with us!"
_The default message can be set in the config but players can change the thank-you message by using a custom named piece of
paper as the paper ingredient for their receipt._

### Crafting Receipts

* Players can craft receipts for transactions by placing the payment amount of coins in the crafting table with paper. 
* When a receipt is crafted, the date, amount, and player name will be added to the receipt. 
* Receipts from the same player and date will stack and sum the totals.

## Ledgers

Ledgers allow players to catalog up to 100 receipts into an organized written book through the crafting table.

* Ledgers are named after the player that crafted them, unless crafted by a crafter, as "Ledger of {PlayerName}".
* Each Ledger includes the date created, date updated, number of records (pages), the total amount from catalogued receipts in copper coins, and the generation on copied Ledgers.
* Every page in the Ledger represents a catalogued stack of receipts consisting of the date the receipt was created, the name of the receipt, and the total amount of the receipt in copper coins.
* Ledgers can be duplicated and players can continue to add receipts to the duplicated Ledgers, if there are less than 100 pages in the Ledger. 
Duplicated ledgers are custom named as "Copied {ItemName}" and a generation tooltip is appended.
* Ledgers include any custom messages on Receipts. This includes custom names and, if different from the default thank-you message, the custom thank-you message.

_When crafting Ledgers, they will keep the custom name from Book and Quill's. Ledgers maintain their custom name as more receipts are added._

### Crafting Ledgers

* Players can craft Ledgers, to catalog their Receipts, by placing a Book and Quill in a crafting table with any number of Receipts. 
* Each stack (slot in the crafting table) of receipts will be added to the Ledger as individual pages.
* Players can continue to add Receipts to their Ledger at any time by placing the Ledger in a crafting with any number of Receipts in the same way.
* Ledgers can only hold up to 100 Receipts/pages.
* Ledgers can be duplicated by placing a Ledger in a crafting table with a Book and Quill.

## Additional Notes

* Dates are in the format: YYYY-MM-DD
* Ledgers aren't just for tracking spending's and earnings. 
They can also be used to track when amounts are placed into, and taken out of, a "bank account" or vault. 
Or, to review shops and services.
* It might be wise to keep at least 2 Ledgers for a shop. One for earnings and one for spending.
* Shops that include a Decorated Pot on top of a Hopper pointed into a Chest will make it easy 
for shoppers to submit copies of their Receipts to the shop for the shop owner to catalog in their shop's Ledger.
* A lot of the functionality of this addon has been inspired by the habits of members from a popular SMP with a shopping district.
* In single player, players can use this addon to keep track of coins earned in their world.
* In multiplayer, this addon offers a broad range of new role playing opportunities.

With transactions between players it can be pretty straightforward creating a Receipt and filing it in a Ledger. 
But, players can get really fancy with their bookkeeping by renaming the piece of paper used as the ingredient to craft the Receipt to add a footnote. 
This footnote can be used as a thank-you message or other note, like a review or reminder.
Additionally, after crafting a Receipt players can rename the Receipt. 
When a renamed Receipt is added to a Ledger, it will record the custom name in the Ledger.

## Support

* Request features and report bugs at https://github.com/VillagerUnknown/VillagerCoin-Bookkeeping/issues
* View the changelog at https://github.com/VillagerUnknown/VillagerCoin-Bookkeeping/blob/main/CHANGELOG.md
